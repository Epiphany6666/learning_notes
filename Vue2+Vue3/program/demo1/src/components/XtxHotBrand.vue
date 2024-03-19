<template>
      <!-- 热门品牌 -->
    <div class="hot">
      <div class="wrapper">
        <div class="title">
          <div class="left">
            <h3>热门品牌</h3>
            <p>国际经典 品质认证</p>
          </div>
          <div class="button">
            <a href="#"><i class="iconfont icon-arrow-left-bold"></i></a>
            <a href="#"><i class="iconfont icon-arrow-right-bold"></i></a>
          </div>
        </div>
        <div class="bd">
          <ul>
            <li>
              <a href="#">
                <img src="@/assets/images/hot1.png" alt="" />
              </a>
            </li>
            <li>
              <a href="#">
                <img src="@/assets/images/hot2.png" alt="" />
              </a>
            </li>
            <li>
              <a href="#">
                <img src="@/assets/images/hot3.png" alt="" />
              </a>
            </li>
            <li>
              <a href="#">
                <img src="@/assets/images/hot4.png" alt="" />
              </a>
            </li>
            <li>
              <a href="#">
                <img src="@/assets/images/hot5.png" alt="" />
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>
/* 热门品牌 */
.hot {
  margin-top: 60px;
  padding-bottom: 40px;
  overflow: hidden;
  background-color: #F5F5F5;
}
.hot .title {
  position: relative;
  margin-bottom: 40px;
}
.hot .button {
  display: flex;
  position: absolute;
  right: 0;
  top: 47px;
}
.hot .button a {
  display: block;
  width: 20px;
  height: 20px;
  background-color: #ddd;
  text-align: center;
  line-height: 20px;
  color: #fff;
}
.hot .button a:nth-child(2) {
  margin-left: 12px;
  background-color: #00BE9A;
}
.hot .bd ul {
  display: flex;
  justify-content: space-between;
}
.hot .bd li {
  width: 244px;
  height: 306px;
}

/* 最新专题 */
.topic {
  padding-top: 60px;
  margin-bottom: 40px;
}
.topic_bd ul {
  display: flex;
  justify-content: space-between;
}
.topic_bd li {
  width: 405px;
  height: 355px;
}
.topic_bd .pic {
  position: relative;
  width: 405px;
  height: 288px;
}
.topic_bd .txt {
  display: flex;
  justify-content: space-between;
  padding: 0 15px;
  height: 67px;
  line-height: 67px;
  color: #666;
  font-size: 14px;
}
.topic_bd .txt .left {
  display: flex;
}
.topic_bd .txt .left p {
  margin-right: 20px;
}
.topic_bd .txt .left .red {
  color: #AA2113;
}
.topic_bd .info {
  position: absolute;
  left: 0;
  bottom: 0;
  display: flex;
  justify-content: space-between;
  padding: 0 15px;
  width: 100%;
  height: 90px;
  background-image: linear-gradient(180deg, rgba(137,137,137,0.00) 0%, rgba(0,0,0,0.90) 100%);
}
.topic_bd .info .left {
  padding-top: 20px;
  color: #fff;
}
.topic_bd .info .left h5 {
  margin-bottom: 5px;
  font-size: 20px;
}
.topic_bd .info .right {
  margin-top: 35px;
  padding: 0 7px;
  height: 25px;
  line-height: 25px;
  background-color: #fff;
  color: #AA2113;
  font-size: 15px;
}
</style>