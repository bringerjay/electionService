(function(){
    var eService = new ElectionServices();
    var $cnameFld
    var body
    var rowTemplate
    var $submitbotton
    var candidates
    $(main);
    function main() {
        console.log("running")
        $cnameFld = $("#vote");
        $submitbotton = $("#submit")
        rowTemplate = $(".result");
        body= $(".etbody");
        eService.read().then(renderResult)
        console.log(eService.read())
        $submitbotton.click(vote)
    }
    function renderResult(candidates) {
        console.log(candidates)
        body.empty()
        for(var c=0; c<candidates.length; c++) {
            var clone = rowTemplate.clone()
            clone.removeClass('hidden')
            clone.find(".name").html(candidates[c].name)
            clone.find(".vote").html(candidates[c].votes)
            body.append(clone)
        }
    }
    function vote() {
        const candidateName = $cnameFld.val()
        body.empty()
        eService.vote(candidateName).then(renderResult)
        }
})();