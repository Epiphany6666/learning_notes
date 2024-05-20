const path = require('path')
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    entry: './src/index.ts',
    output: {
        path: path.resolve(__dirname, 'dist'),
        filename: 'main.js',
    },
    resolve: {
        // 指定哪些文件类型可省略后缀名称
        extensions: ['.js', '.ts', '.tsx']
    },

    devtool: 'eval-cheap-module-source-map',

    devServer: {
        open: true, 
        hot: true,
        port: 9000 // 通过devServer启动一个开发期间用到的服务器，端口号是9000
    },
    // 接下来就是重点内容了：关于文件的处理方式
    module: {
        rules: [
            // 处理 .ts or .tsx 文件
            // .tsx文件就是react的jsx对应到ts后的文件形式
            {
                test: '/\.tsx?$/',
                use: 'ts-loader', // 使用ts-loader来处理ts文件
                exclude: /node_modules/ // 不去处理node_modules中的ts文件
            }
        ]
    },
    plugins: [
        new HtmlWebpackPlugin({
            // 指定html的输出位置，将来在启动服务器的时候就可以来打开这个页面了
            template: path.join(__dirname, './src/index.html')
        }
    )],
};