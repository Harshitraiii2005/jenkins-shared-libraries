def call(String dockerUser, String imageName, String tag) {
    docker_login()

    sh """
    docker push ${dockerUser}/${imageName}:${tag}
    """
}
