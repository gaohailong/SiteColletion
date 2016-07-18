<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-1.11.3.js"></script>

    <link href="css/site.css" rel="stylesheet">
</head>
<body onload="onload()">
<div class="header">
    <ul>
        <li><a href="#">Site</a></li>
        <li><a href="#">Site</a></li>
        <li><a href="#">Site</a></li>
        <li><a href="#">Site</a></li>
        <li><a href="#">Site</a></li>
    </ul>
</div>
<div class="content">
    <div class="site_left">
        <div class="site_item">
            <h4 class="category_name">Android</h4>
            <ul id="android">
               <!--  <li><a href="#">CSDN</a></li>
                <li><a href="#">微软</a></li>
                <li><a href="#">得到</a></li>
                <li><a href="#">微软</a></li> -->
            </ul>
        </div>
      <div class="site_item">
            <h4 class="category_name">JavaWeb</h4>
            <ul id="JavaWeb">
              <!--   <li><a href="#">CSDN</a></li>
                <li><a href="#">微软</a></li>
                <li><a href="#">得到</a></li>
                <li><a href="#">微软</a></li> -->
            </ul>
        </div>
       <!--    <div class="site_item">
            <h4 class="category_name">Android</h4>
            <ul>
                <li><a href="#">CSDN</a></li>
                <li><a href="#">微软</a></li>
                <li><a href="#">得到</a></li>
                <li><a href="#">微软</a></li>
            </ul>
        </div> -->
    </div>
    <div class="site_right">
        <div class="site_block">
            <div class="s_first">
                <h4 class="s_category_name">Android</h4>
                <ul>
                    <li><a href="#">CSDN</a></li>
                    <li><a href="#">微软</a></li>
                    <li><a href="#">得到</a></li>
                    <li><a href="#">微软</a></li>
                </ul>
            </div>
            <div class="s_first">
                <h4 class="s_category_name">Android</h4>
                <ul>
                    <li><a href="#">CSDN</a></li>
                    <li><a href="#">微软</a></li>
                    <li><a href="#">得到</a></li>
                    <li><a href="#">微软</a></li>
                </ul>
            </div>
            <div class="s_first">
                <h4 class="s_category_name">Android</h4>
                <ul>
                    <li><a href="#">CSDN</a></li>
                    <li><a href="#">微软</a></li>
                    <li><a href="#">得到</a></li>
                    <li><a href="#">微软</a></li>
                </ul>
            </div>
            <div class="s_first">
                <h4 class="s_category_name">Android</h4>
                <ul>
                    <li><a href="#">CSDN</a></li>
                    <li><a href="#">微软</a></li>
                    <li><a href="#">得到</a></li>
                    <li><a href="#">微软</a></li>
                </ul>
            </div>
            <div class="s_first">
                <h4 class="s_category_name">Android</h4>
                <ul>
                    <li><a href="#">CSDN</a></li>
                    <li><a href="#">微软</a></li>
                    <li><a href="#">得到</a></li>
                    <li><a href="#">微软</a></li>
                </ul>
            </div>
            <div class="s_first">
                <h4 class="s_category_name">Android</h4>
                <ul>
                    <li><a href="#">CSDN</a></li>
                    <li><a href="#">微软</a></li>
                    <li><a href="#">得到</a></li>
                    <li><a href="#">微软</a></li>
                </ul>
            </div>
            <div class="s_first">
                <h4 class="s_category_name">Android</h4>
                <ul>
                    <li><a href="#">CSDN</a></li>
                    <li><a href="#">微软</a></li>
                    <li><a href="#">得到</a></li>
                    <li><a href="#">微软</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>

<button class="add" id="add_site" value="add">ADD</button>

<div class="pop">
    <div class="p_top">
        <strong class="p_title">添加网站</strong>
        <strong class="p_close">X</strong>
    </div>
    <input class="p_name" type="text" name="name" placeholder="名称"/><br>
    <input class="p_link" type="text" name="link" placeholder="网址"/><br>
    <input class="p_categeory" type="text" name="categeory" placeholder="分类"/><br>
    <input class="p_submit" id="p_submit" type="button" value="提交"/>
</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/site.js"></script>
</body>
</html>