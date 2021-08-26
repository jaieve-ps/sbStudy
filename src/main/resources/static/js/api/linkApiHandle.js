$(document).ready(function(){
    console.log("linkApiHandle 실행");
    const source = $('#template-link').html();
    const modalSource = $('#template-modalBtn').html();
    const template = Handlebars.compile(source);
    $.ajax({
        url: "/api/link",
        type: "GET"
    }).done(function (result) {
        // data for template
        let data = {
            linkList: []
        }
        // JSON -> Object
        const obj = eval(result);
        // object -> domain & url 가진 List
        let linkList = new Array(Object.keys(obj).length);
        for (var i = 0; i < Object.keys(obj).length; i ++){
            //object in List : key is domain and url
            data.linkList[i] = obj[i+1][0];
        }
        const html = template(data);
        $('#templateProfileAppend').append(html);
        $('#templateProfileAppend').append(modalSource);
    }).fail(function (xhr, error, status){
        console.log(xhr);
    });

});