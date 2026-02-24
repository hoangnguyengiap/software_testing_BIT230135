const { defineConfig } = require("cypress")

module.exports = defineConfig({
  video: true,
  videoCompression: false,
  trashAssetsBeforeRuns: true,

  e2e: {
    setupNodeEvents(on, config) {
      return config
    },
  },
})