<%@page pageEncoding="UTF-8" %>

<script>
    function agreecheck() { // 이용약관/개인정보이용 동의 확인
        let agree1 = document.getElementById('agree1');
        let agree2 = document.getElementById('agree2');

        if (!agree1.checked) alert('이용약관에 동의하세요!');
        else if (!agree2.checked) alert('개인정보 이용에 동의하세요!');
        else location.href = '/join/checkme';
    }

    try {
    let okagree = document.getElementById('okagree');
    okagree.addEventListener('click', agreecheck);
    } catch (e) {
        // alert('agree 관련 오류 발생!!');
    } // join/agree 에서만 적용


    function realcheck() {
        let name2 = document.getElementById("name2");
        let jumin1 = document.getElementById("jumin1");
        let jumin2 = document.getElementById("jumin2");
        let usejm = document.getElementById("usejm");

        if (name2.value == "") alert('이름을 입력하세요');
        else if(jumin1.value == "" || jumin2.value == "")
            alert('주민번호를 입력하세요');
        else if(!usejm.checked) alert('처리 동의에 체크하세요!');
        else {
            // 질의문자열 생성
            let params = '?name=' + name2.value;
            params += '&jumin1=' + jumin1.value;
            params += '&jumin2=' + jumin2.value;
            location.href = '/join/joinme' + params;
        }
    }

    //let check2btn = document.getElementById("check2btn");
    //check2btn.addEventListener('click', realcheck);

    // 문서내 특정 요소 선택 후 액션 지정 : $(선택자).함수명
    $('#check2btn').click(function() { realcheck(); } );

</script>

