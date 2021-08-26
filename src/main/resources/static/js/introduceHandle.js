$(document).ready(function(){
    console.log("introduceHandle 실행");
    const parentHtmlTag = document.querySelector('.introduceParent');

    const source = $('#template-introduce').html();
    const template = Handlebars.compile(source);

    var data = {
            favQuote: "null",
            religion : "null"
    }
    //1. fetch로 api data 받기(get, data : {id : 1}
    const url = "/api/personList"
//    const apiData = {id:1};
    fetch(url)
        .then(function(res) {
            return res.json();
        })
        .then(function(res) {
            console.log(res);
        }).catch(function (error) {
            console.log('request failed', error);
    })
    // 2. 받은 데이터를 핸들바 데이터로 저장
    // 3. data를 템플릿에 넣기(실패한 경우 기본값 넣기)
    const html = template(data);
    // 4. 상위 태그에 삽입 (append)
    parentHtmlTag.append(html);

});