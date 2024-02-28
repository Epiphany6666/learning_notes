const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const MiniCssExtractPlugin = require('mini-css-extract-plugin');
const CssMinimizerPlugin = require("css-minimizer-webpack-plugin")

module.exports = {
  mode: 'development',
  entry: path.resolve(__dirname, 'src/login/index.js'),
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: './login/index.js',
    clean: true
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: path.resolve(__dirname, 'public/login.html'),
      filename: path.resolve(__dirname, 'dist/login/index.html')
    }),
    new MiniCssExtractPlugin({
      filename: './login/index.css'
    })
  ],
  module: {
    rules: [ // 规则列表
      {
        test: /\.css$/i, // 匹配 .css 结尾的文件
        use: [
          // process.env 是node环境中内置的环境变量，给这个对象新增了NODE_ENV
          // 这一句代码在执行赋予的时候，它会赋予对应不同的值，所以当我们运行开发环境时，这个变量的值就为development
          process.env.NODE_ENV === 'development' ? 'style-loader' : MiniCssExtractPlugin.loader, 'css-loader'
        ], // 使用从后到前的加载器来解析 css 代码和插入到 DOM
      },
      {
        test: /\.less$/i,
        // 先使用 "less-loader" 把less文件里的代码转成css代码
        // 再借助 "css-loader" 来分析css代码
        // 然后使用 'style-loader' 帮我们插入到DOM上
        use: [
          // 'style-loader',
          process.env.NODE_ENV === 'development' ? 'style-loader' : MiniCssExtractPlugin.loader,
          "css-loader",
          "less-loader"]
      },
      {
        // 以哪些文件结尾时，对这些资源模块文件，这里没有使用use...loader，而是内置，内置之后你需要用type的方式控制资源模块的打包类型
        test: /\.(png|jpg|jpeg|gif)$/i,
        type: 'asset',
        generator: {
          // 输出到的位置，它会默认以output.path为相对路径，所以输出到了dist下的assets下的文件的名字，[hash][ext][query]是webpack提供的固定的占位符
          filename: 'assets/[hash][ext][query]'
        }
      }
    ]
  },
  optimization: {
    minimizer: [
      `...`,
      new CssMinimizerPlugin(),
    ]
  }
};