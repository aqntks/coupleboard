var main = {
    init : function () {
        var _this = this;
        $('#btn_profile_save').on('click', function () {
            _this.save();
        });

        $('#btn_profile_update').on('click', function () {
            _this.update();
        });
    },
    save : function () {
        var data = {
            user1_name: $('#user1_name').val(),
            user1_job: $('#user1_job').val(),
            user1_year: $('#user1_year').val(),
            user1_month: $('#user1_month').val(),
            user1_date: $('#user1_date').val(),
            user1_address: $('#user1_address').val(),
            user1_instagram: $('#user1_instagram').val(),
            user1_facebook: $('#user1_facebook').val(),
            user1_email: $('#user1_email').val(),
            user1_img_path: $('#user1_img_path').val(),
            user1_about: $('#user1_about').val(),
            user2_name: $('#user2_name').val(),
            user2_job: $('#user2_job').val(),
            user2_year: $('#user2_year').val(),
            user2_month: $('#user2_month').val(),
            user2_date: $('#user2_date').val(),
            user2_address: $('#user2_address').val(),
            user2_instagram: $('#user2_instagram').val(),
            user2_facebook: $('#user2_facebook').val(),
            user2_email: $('#user2_email').val(),
            user2_img_path: $('#user2_img_path').val(),
            user2_about: $('#user2_about').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/couple_profile',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('프로필이 저장됐습니다.');
            window.location.href = '/edit_profile';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    update : function () {
        var data = {
            user1_name: $('#user1_name').val(),
            user1_job: $('#user1_job').val(),
            user1_year: $('#user1_year').val(),
            user1_month: $('#user1_month').val(),
            user1_date: $('#user1_date').val(),
            user1_address: $('#user1_address').val(),
            user1_instagram: $('#user1_instagram').val(),
            user1_facebook: $('#user1_facebook').val(),
            user1_email: $('#user1_email').val(),
            user1_img_path: $('#user1_img_path').val(),
            user1_about: $('#user1_about').val(),
            user2_name: $('#user2_name').val(),
            user2_job: $('#user2_job').val(),
            user2_year: $('#user2_year').val(),
            user2_month: $('#user2_month').val(),
            user2_date: $('#user2_date').val(),
            user2_address: $('#user2_address').val(),
            user2_instagram: $('#user2_instagram').val(),
            user2_facebook: $('#user2_facebook').val(),
            user2_email: $('#user2_email').val(),
            user2_img_path: $('#user2_img_path').val(),
            user2_about: $('#user2_about').val()
        };

        var id = $('#id').val();

        $.ajax({
            type: 'PUT',
            url: '/api/v1/couple_profile/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('프로필이 저장됐습니다.');
            window.location.href = '/edit_profile';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
};

main.init();