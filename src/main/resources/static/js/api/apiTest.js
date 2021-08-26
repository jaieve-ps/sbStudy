$(document).ready(function(){
    console.log("apiTest.js 실행");
    const apiBtn = document.querySelector('#apiBtn'),
        pageTitle = document.querySelector('#pageTitle');

    function changeTitle() {
        pageTitle.innerHTML += "<span> NEW! </h3>";
        // 실행되면 플래그 바꿔서 두번째부터는 실행되지 않게 조건문 걸기
    }

    function btnClick() {
        $.ajax({
            url:'/api/person',
            type:'get',
            data:{id:1}
        }).done(function (result) {
            console.log(result);
            changeTitle(); // 상단의 Resume에 데이터 변화를 알려주는 "NEW!" 추가
        }).fail(function(xhr, error, status){
            console.table(xhr);
            console.table(error);
            console.table(status);
        });

    }
    apiBtn.addEventListener('click', btnClick);

});