<script setup>
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";
import router from "../router";

// Api
const repository = new ApiRepository("quienesSomos");
const api = repository.chooseApi();

const memberCardxPage = 3;
const start = ref(0);
const end = computed(() => Math.min(start.value + memberCardxPage, membersList.value.length));

let membersList = ref([]);
onBeforeMount(async () => {
  membersList.value = await api.getAll();
});

const membersToShow = computed(() => {
  return membersList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += memberCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - memberCardxPage, 0);
};

const page = (algo) => {
  start.value = algo;
};

function deletePost(id) {
        
        fetch(`http://localhost:8080/api/users/${id}`, { method: 'DELETE' , headers: {
            'Content-Type' : 'application/json'
        }});
        alert('Delete successful');
       location.reload();
    }
</script>
<template>
  <main>
    <table>
      <thead>
        <tr id="titles">
          <th id="start" class="titles" scope="col">
            <p>Imagen de Usuario</p>
            <p>Nombre</p>
            <p>Apellido</p>
            <p>Fecha de Admisión</p>
            <p>
               
            </p>
          </th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="member in membersToShow" :key="member.id" :member="member">
          <td>
            <p><img
        class="imgCard"
        :src="`http://localhost:8080/images/user-photos/${member.imageUser.image}`"
        alt="Imagen"
      /></p>
            <p>{{ member.name }}</p>
            <p>{{ member.lastname }}</p>
            <p>{{ member.dateadmission }}</p>
            <p class="d-flex row">
                <button type="button" class="btn btn-danger" @click="deletePost(member.id)">Borrar</button>
                <button type="button" class="btn btn-warning">Modificar</button>
                <button type="button" class="btn btn-success">Imagen</button>
            </p>
          </td>
        </tr>
      </tbody>
    </table>
    <Pagination :pageSize="memberCardxPage" :start="start" :end="end" :maxLength="membersList.length" @change="page" @prev="prev" @next="next" />
  </main>
</template>

<style scoped lang="scss">
@import "../assets/sass/variables";
@import "../assets/sass/styles.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";
table {
    border-collapse: collapse;
    width: 100%;
    overflow: hidden;

    #titles {
      border-radius: 10% 10% 0 0;
    }
    .titles {
      padding: 5px 10px;
    }
    tbody tr:nth-child(odd) {
      background: $background-card;
      transition: all 0.4s;
      border-radius: 10px;
      td {
        display: grid;
        column-gap: 10px;
        grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
        padding: 5px 10px;
        border-radius: 10px;
        p {
          margin-bottom: 0;
        }
        p:nth-child(n + 4) {
          font-style: oblique;
        }
      }
    }
    tbody tr:nth-child(odd):hover {
      background: #ccc;
      transform: scale(1.05);
      font-weight: bold;
    }

    tbody tr:nth-child(even) {
      background: $background-component;
    //   transition: all 0.4s;
      border-radius: 10px;
      td {
        display: grid;
        column-gap: 10px;
        grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
        padding: 5px 10px;
        border-radius: 10px;
        p {
          margin-bottom: 0;
        }
        // p:nth-child(n + 4) {
        //   font-style: oblique;
        // }
      }
    }
    tbody tr:nth-child(even):hover {
      background: #ccc;
      transform: scale(1.05);
      font-weight: bold;
    }
    thead {
      background: $background-upcomingEvents;
      color: #fff;
      font-size: 18px;
      font-family: Mont;
      border-radius: 5%;
      th {
        display: grid;
        column-gap: 10px;
        grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
        border-radius: 5%;
        p {
          margin-bottom: 0;
        }
        p:nth-child(n + 4) {
          font-style: oblique;
        }
      }
    }
  }
  img{
    aspect-ratio: 16/9;
      width: 30%;
      object-fit: cover;
  }
  .btn{
    margin: 0.3em;
    width: 5.4em;
  }
</style>