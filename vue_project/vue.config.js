const { defineConfig } = require('@vue/cli-service');

module.exports = defineConfig({
  devServer: {
    port: 80,
    proxy: {
      '/api': {
        target: 'http://113.44.203.204:8080',
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    }
  },
  transpileDependencies: true // 保留你的原有配置
});
