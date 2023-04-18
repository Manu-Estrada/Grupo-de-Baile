<script setup>
const props = defineProps({
  item: { type: Object },
});
</script>
<template>
    <div class="card">
        <div class="row g-0">
            <div class="col-md-6" v-if="item.imageAboutUs">
                <img :src="`http://localhost:8080/images/aboutus-photos/${item.imageAboutUs.image}`" alt="..." />
            </div>
            <div class="col-md-6">
                <div class="card-body">
                    <h5 class="card-title">Xaréu D'Ochobre</h5>
                    <p class="card-text">
                        Nacida en Avilés, Asturias, el 28 de octubre de 1988, la
                        Agrupación Cultural Xaréu d´ Ochobre se dedica a la conservación y
                        divulgación de la música y danza tradicional asturiana.
                    </p>
                    <p class="card-text">
                        La agrupación, fundada y dirigida desde sus inicios por D. José
                        Federico Álvarez Palacios, cuenta en la actualidad con 35
                        componentes de ambos sexos con edades comprendidas entre los 10 y
                        65 años, habiendo pasado por la misma más de 350 personas en el
                        transcurso de su historia.
                    </p>
                </div>
            </div>
        </div>
    </div>
</template>

<style scoped lang="scss">
@import "../../assets/sass/_variables";

.strong {
    font-weight: bold;
}

ul li::before {
    content: "- ";
}

ul.strong li::before {
    content: "";
}

h6 {
    font-weight: bold;
    text-decoration: underline;
}

h6 {
    font-weight: bold;
    text-decoration: underline;
}

.card-body {
    background-color: #ffffff;
}

h5 {
    color: #cc0033;
}

img {
    width: 100%;
    object-fit: cover;
    aspect-ratio: 1/1;
}

.card {
    --bs-card-border-width: none;
    --bs-card-border-color: var(--bs-border-color-translucent);
    --bs-card-border-radius: none;
    --bs-card-inner-border-radius: calc(none);
    border: none;
    border-radius: none;
}

.card:nth-child(even) .row {
    flex-direction: row-reverse;
}

.card-body {
    overflow: auto;
    height: 44vw;
    scrollbar-color: rgba(0, 0, 0, 0.5) rgba(0, 0, 0, 0);
    scrollbar-width: thin;
    margin-right: 15px;
    margin-top: 15px;
    padding: 3em 4em 4em 4em;
}

.card-body::-webkit-scrollbar {
    -webkit-appearance: none;
}

.card-body::-webkit-scrollbar:vertical {
    width: 10px;
}

.card-body::-webkit-scrollbar-button:increment,
.card-body::-webkit-scrollbar-button {
    display: none;
}

.card-body::-webkit-scrollbar:horizontal {
    height: 10px;
}

.card-body::-webkit-scrollbar-thumb {
    background-color: $background-green;
    border-radius: 20px;
    border: 2px solid #f1f2f3;
}

.contenedor::-webkit-scrollbar-track {
    border-radius: 10px;
}


@media (max-width: 768px) {
    .card-body {
        height: 100vw;
        padding: 1rem;
    }
}
</style>
