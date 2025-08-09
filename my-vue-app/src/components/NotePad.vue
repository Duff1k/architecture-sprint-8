<template>
  <div class="welcome">
    <h1>Welcome</h1>
    <p>{{ notes }}</p>
    <button @click="loadNotes()" >View Notes</button>
  </div>
</template>

<script>
import { fetchData } from '@/services/api';

export default {
  name: 'NotePad',
  data() {
    return {
      notes: ''
    };
  },
  methods: {
    async loadNotes() {
      console.log('inside load notes')
      const data = await fetchData();
      if (data) {
        this.notes = data;
      }
      console.log('notes loading done..')
    }
  }

};
</script>
