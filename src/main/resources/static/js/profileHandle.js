// 이 파일을 받는 곳에서 이 파일이 받아지기 전에 핸들바를 임포트했다면 js파읾안에서는 임포트하지 않아도 된다.
$(document).ready(function(){
    const source = $('#template-profile').html();
    const data = {
        name : "handle",
        email : "handle@gmail.com"
    }

    const html = template(data);

    $('#templateAppend').append(html);

    $.ajax({
        url: "/polestar/skillMap",
        type: "GET",
        // Accept: "application/json" // request할 때 값 특정 형태의 값만 받고자 할 때 설정
    }).done(function(result){
        console.dir(result);
   //   $('#test').val(jsonData.userEmail); //input tag
    }).fail(function(xhr, error, status) {
        console.log(xhr);
    });
});