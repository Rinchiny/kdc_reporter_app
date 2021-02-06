module.exports = {
    outputDir: 'build/dist',
    assetsDir: 'static',
    devServer: {
        host: 'localhost',
        port: 8010,
        proxy: 'http://localhost:8080'
    }
}
