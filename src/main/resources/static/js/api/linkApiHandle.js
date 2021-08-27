$(document).ready(function(){
    console.log("linkApiHandle 실행");
    const source = $('#template-link').html();
    const modalSource = $('#template-modalBtn').html();
    const template = Handlebars.compile(source);
    $.ajax({
        url: "/api/link",
        type: "GET"
    }).done(function (result) {
        // result type is object whom value is array
        let linkArray = [];
        // object -> List
        for (var i = 0; i < Object.keys(result).length; i ++){
            linkArray[i] = result[i+1][0];
        }
        // linkArray type is Array
        const data = {
            linkArray : linkArray
        }
        const html = template(data);
        $('#templateProfileAppend').append(html);
        $('#templateProfileAppend').append(modalSource);
    }).fail(function (xhr, error, status){
        console.log(xhr);
    });

});