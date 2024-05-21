const path = require('path')
const HtmlWebpackPlugin = require('html-webpack-plugin')
const MiniCssExtractPlugin = require("mini-css-extract-plugin")
const CssMinimizerPlugin = require("css-minimizer-webpack-plugin");
module.exports = {
    entry: path.resolve(__dirname, 'src/login/index.js'),
    output: {
        path: path.resolve(__dirname, 'dist'),
        filename: './login/index.js',
        clean: true
    },
    plugins: [
        new HtmlWebpackPlugin({
            // 这里可以使用绝对路径，如果使用相对路径，则以当前出口的目录为相对路径，但是使用绝对路径语义更明确
            // template: './public/login.html', 
            // filename: './login/index.html' 
            template: path.resolve(__dirname, 'public/login.html'), // 模板文件
            filename: path.resolve(__dirname, 'dist/login/index.html') // 输出文件
        }),
        new MiniCssExtractPlugin(),
        new MiniCssExtractPlugin({
            filename: "[name].css",
            chunkFilename: "[id].css",
        }),
    ],
    module: { // module就是放一些加载器的配置项
        rules: [ // 规则列表
            {
                test: /\.css$/i, // 匹配 .css 结尾的文件
                // use: ['style-loader', 'css-loader'], // 使用从后到前的加载器来解析 css 代码和插入到 DOM
                use: [MiniCssExtractPlugin.loader, "css-loader"],
            }
        ]
    },
    optimization: {
        minimizer: [
            // For webpack@5 you can use the `...` syntax to extend existing minimizers (i.e. `terser-webpack-plugin`), uncomment the next line
            `...`,
            new CssMinimizerPlugin(),
        ],
    },
};