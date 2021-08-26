function print() {
    console.log("확인");
}

$(document).ready(function(){
    print();
    $("#popup-btn").on("click", function(){
        console.log("버튼 클릭")
        $.ajax({
            url: "/api/users",
            type: "GET",
            // Accept: "application/json" // request할 때 값 특정 형태의 값만 받고자 할 때 설정
        }).done(function(result){
            console.log(result);
            const jsonData = result;

            $('#test').val("success");
//            $('#test').val(jsonData.userEmail);
        }).fail(function(xhr, error, status) {
            $('#test').val("fail!");
            console.log(xhr);
        });
    });
});