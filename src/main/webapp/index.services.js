function ElectionServices() {
    this.read = read;
    this.vote = vote;
    this.url = '/api/candidates';
    var self = this;
    function vote(candidateName) {
       return fetch('/api/candidates/'+candidateName,
            {
                method: 'PUT'
            })
            .then(function (response) {
                return response.json()
            })}
    function read(){
       return fetch('/api/candidates')
            .then(function (response) {
                return response.json()
            })
}}