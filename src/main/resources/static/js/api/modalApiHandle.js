$(document).ready(function(){
    console.log("modalAPI.js 실행");
    // TODO linkApuHandle 참고해서 코드 완성하기(가져올 데이터는 Person의 religion과 favQoute)
    $("#popup-btn").on("click", function(){
        console.log("버튼 클릭")
        $.ajax({
            url: "/api/person",
            type: "GET",
            data: {id: 1},
            // Accept: "application/json" // request할 때 값 특정 형태의 값만 받고자 할 때 설정
        }).done(function(result){
            $('#userName').html(result.name);
            $('#userEmail').html(result.email);
//            $('#test').val(jsonData.userEmail); //input tag
        }).fail(function(xhr, error, status) {
            console.log(xhr);
        });
    });
});