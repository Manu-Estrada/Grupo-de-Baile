package com.baile.grupodebaile.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.baile.grupodebaile.models.ImageUser;
import com.baile.grupodebaile.models.User;
import com.baile.grupodebaile.repositories.ImageUserRepository;
import com.baile.grupodebaile.repositories.UserRepository;
// import com.baile.grupodebaile.utils.FileUploadUtil;
import com.baile.grupodebaile.utils.FileUploadUtil;

@Service
public class UserService {
    
    private UserRepository repository;

    @Autowired
    private ImageUserRepository imageUserRepository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User store(User user) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodePassword = encoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        return repository.save(user);
    }

    public void saveImageUser(MultipartFile multipartFile, Long id) throws IOException{
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        String uploadDir = "src/main/resources/static/user-photos/";
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        ImageUser imageUserNew = new ImageUser();
        imageUserNew.setImage(fileName);
        imageUserRepository.save(imageUserNew);

        User userToAddImage = repository.findById(id).orElseThrow();
        userToAddImage.setImageUser(imageUserNew);
        repository.save(userToAddImage);
    }
    
    public List<User> listAll() {
        return repository.findAll();
    }

    public User listOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public User listOneByName(String userName) {
        return repository.findByUsername(userName).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}