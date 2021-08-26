$(document).ready(function(){
    console.log("introduceHandle 실행");
    const parentHtmlTag = document.querySelector('#collapseOne');
    const apiBtn = document.querySelector('#apiBtn');

    const source = $('#template-introduce').html();
    const template = Handlebars.compile(source);

    function getIntroduce(){
        //1. fetch로 api data 받기(get, data : {id : 1}
        $.ajax({
            url: "/api/person",
            type: "GET",
            data: {id:1}
        }).done(function(result){
            const getData = {
                introduce : result.introduce,
                favQuote : result.favQuote
            };
            html = template(getData);
            $('#collapseOne').html(html);
        }).fail(function(xhr, error, status) {
            console.log(xhr);
        });
        // 2. 받은 데이터를 핸들바 데이터로 저장
        // 3. data를 템플릿에 넣기(실패한 경우 기본값 넣기)
        // 4. 상위 태그에 삽입 (append)

    }

    apiBtn.addEventListener('click', getIntroduce);
});