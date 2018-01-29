angular.module('app', []).controller('pojazdController', function ($http) {
    var vm = this;
    console.log("Inicjowanie angulara");
    vm.addPojazd = function (pojazd) {
        console.log("Wywolanie http!");
        $http({
            method: 'POST',
            url: 'http://localhost:8080/cepik/pojazd',
            data: pojazd
        }).then(function success(response) {
            vm.pojazd = {};
            console.log(response);
        }, function error(response) {
            console.log('Data not saved ' + pojazd);
        });
    }
});
console.log("wywolanie js !");