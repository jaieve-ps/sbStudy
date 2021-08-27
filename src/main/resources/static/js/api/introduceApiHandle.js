$(document).ready(function(){
    console.log("apiTest.js 실행");
    const apiBtn = document.querySelector('#apiBtn'),
        pageTitle = document.querySelector('#pageTitle');
    let isClick = false;

    function changeTitle() {
        if (isClick == false) {
            pageTitle.innerHTML += "<span> NEW! </h3>";
            isClick = true;
            apiBtn.removeEventListener('click', btnClick);
        }
    }

    function btnClick() {
        $.ajax({
            url:'/api/person',
            type:'get',
            data:{id:1}
        }).done(function (result) {
            changeTitle(); // 상단의 Resume에 데이터 변화를 알려주는 "NEW!" 추가
        }).fail(function(xhr, error, status){
            console.table(xhr);
            console.table(error);
            console.table(status);
        });

    }
    apiBtn.addEventListener('click', btnClick);


});