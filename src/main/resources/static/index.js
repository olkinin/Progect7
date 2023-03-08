angular.module('frontapp', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8187/app/';

    $scope.loadStudents = function (pageIndex = 1) {
        $http({
            url: contextPath + 'students',
            method: 'GET',
            params: {
                p: pageIndex
            }
        }).then(function (response) {
            console.log(response);
            $scope.studentsPage = response.data;
        });
    };

    $scope.showInfo = function (students) {
        alert(student.name);
    };

    $scope.loadStudents(1);
});
