function confirmMassiveCancel(msg, postProcessFunction) {
    var result = window.confirm(msg);
    if (result == true) {
        postProcessFunction();
    }
}