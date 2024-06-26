module.exports = {
  "plugins": ["vue"],
  "extends": [
    "plugin:vue/recommended"
  ],
  "rules": {
    "vue/multi-word-component-names": ["error", {
      "ignores": ["Home","Main"]
    }]
  }
}
