<template>
  <v-form v-model="valid">
    <v-container>
      <v-row class="text-center">

        <v-col class="mb-4">
          <h1 class="display-2 font-weight-bold mb-3">
            Add User
          </h1>
        </v-col>

        <v-col
          cols="12"
        >
          <v-text-field label="First name" v-model="fname"></v-text-field>
        </v-col>
        <v-col
          cols="12"
        >
          <v-text-field label="Last name" v-model="lname"></v-text-field>
        </v-col>
        <v-col
          cols="12"
        >
          <v-text-field label="Email" v-model="email" :rules="emailRules"></v-text-field>
        </v-col>
        <v-col
          cols="12"
        >
          <v-text-field label="Phone" v-model="phone" 
            :rules="{
            required: true,
            digits: 7,
            regex: '^(71|72|74|76|81|82|84|85|86|87|88|89)\\d{5}$'
          }">
        </v-text-field>
        </v-col>
        <v-col>
          <v-btn class="mr-4" type="submit" :disabled="invalid">
            Submit
          </v-btn>
        </v-col>
      </v-row>
    </v-container>
  </v-form>
</template>

<script>
  export default {
    name: 'HelloWorld',

    data: () => ({
      ecosystem: [
        {
          text: 'vuetify-loader',
          href: 'https://github.com/vuetifyjs/vuetify-loader',
        },
        {
          text: 'github',
          href: 'https://github.com/vuetifyjs/vuetify',
        },
        {
          text: 'awesome-vuetify',
          href: 'https://github.com/vuetifyjs/awesome-vuetify',
        },
      ],
      importantLinks: [
        {
          text: 'Documentation',
          href: 'https://vuetifyjs.com',
        },
        {
          text: 'Chat',
          href: 'https://community.vuetifyjs.com',
        },
        {
          text: 'Made with Vuetify',
          href: 'https://madewithvuejs.com/vuetify',
        },
        {
          text: 'Twitter',
          href: 'https://twitter.com/vuetifyjs',
        },
        {
          text: 'Articles',
          href: 'https://medium.com/vuetify',
        },
      ],
      whatsNext: [
        {
          text: 'Explore components',
          href: 'https://vuetifyjs.com/components/api-explorer',
        },
        {
          text: 'Select a layout',
          href: 'https://vuetifyjs.com/getting-started/pre-made-layouts',
        },
        {
          text: 'Frequently Asked Questions',
          href: 'https://vuetifyjs.com/getting-started/frequently-asked-questions',
        },
      ],
    }),
  }
</script>
