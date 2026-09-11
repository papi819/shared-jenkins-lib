def call(String status, String message) {
    def color

    switch(status) {
        case "SUCCESS":
            color = "good"
            break
        case "FAILURE":
            color = "danger"
            break
        default:
            color = "#cccccc"
    }

    slackSend(
        channel: '#build-notifications',
        color: color,
        message: message
    )
}
