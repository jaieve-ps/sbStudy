// 이 파일을 받는 곳에서 이 파일이 받아지기 전에 핸들바를 임포트했다면 js파읾안에서는 임포트하지 않아도 된다.
$(document).ready(function(){
    console.log("profileHandle 실행");
    const source = $('#template-profile').html();
    const template = Handlebars.compile(source);

    $.ajax({
        url: "/api/person",
        type: "GET",
        data: {id:1}
    }).done(function(result){
        const data = {
            name : result.name,
            email : result.email,
        }
        const html = template(data);
        $('#templateAppend').append(html);
    }).fail(function(xhr, error, status) {
        console.log(xhr);
    });
});