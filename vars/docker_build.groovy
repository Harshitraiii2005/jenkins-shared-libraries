def call(String dockerUser, String imageName, String tag) {
    sh """
    docker build -t ${dockerUser}/${imageName}:${tag} .
    """
}
