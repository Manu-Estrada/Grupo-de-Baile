<template>
    <button
      type="button"
      data-bs-toggle="modal"
      data-bs-target="#exampleModal"
      class="popUp-button-third"
    >
      Evento tercero
    </button>
    <!-- Modal -->
  
    <div
      class="modal fade"
      id="exampleModal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div class="modal-dialog">
        <div class="modal-content">
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            aria-label="Close"
          ></button>
          <div class="event-container">
            <img src="../../../assets/images/folk.svg" alt="" />
            <div class="text-container">
              <span>01-01-2023</span>
              <h3>Evento tercero</h3>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed
                laoreet facilisis dapibus. Donec aliquet ligula ipsum, tincidunt
                viverra risus malesuada ac. Curabitur fringilla sapien sit amet ex
                mollis finibus. Praesent molestie lectus sit amet tortor
                condimentum consectetur. Orci varius natoque penatibus et magnis
                dis parturient montes, nascetur ridiculus mus.
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>
  <style lang="scss" scoped>
  @import "../../../assets/sass/home/popUp-Upcoming-events.scss";
  </style>
  