function print() {
    console.log("확인");
}

$(document).ready(function(){
    print();
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