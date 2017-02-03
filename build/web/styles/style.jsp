<%-- 
    Document   : style
    Created on : 03.02.2017, 18:29:31
    Author     : Dmitry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    body{
        background: #494949;
        color: #ffffff;
    }
    h1.site_name{
        text-align: center;
    }
    div.login{
        margin: auto;
        width: 154px
    }
    span.validationError{
        color: red;
    }
    div.header{
        height: 50px;
    }
    div.header>form{
        float: left;
        margin-left: 10px;
    }
    div.header>span.user{
        font-size: 24px;
        float: left;
    }
    div.header>span.action{
        float: right;
    }

    .menu{
        list-style: none;
        /*border: 1px solid red;*/
        height: 34px;
        margin: 0px;
        padding: 0px;
    }
    .menu>li>input{
        background: #fff;
        width: 100px;
        height: 34px;
        float: left;
        transition: .3s;
    }
    .menu>li:first-child>input{
        border-radius: 5px 0 0 5px;
    }
    .menu>li:last-child>input{
        border-radius: 0 5px 5px 0;
    }
    .menu>li>input:hover, input.button:hover{
        background: #ccc;
    }
    input.button{
        border-radius: 5px;
        background: #fff;
        width: 100px;
        height: 34px;
        float: left;
        transition: .3s;
    }
</style>
