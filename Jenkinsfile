pipeline {
    agent any

    tools('安装环境') {
        maven "maven"
    }

    stages {
        stage('拉取代码') {
            steps {
                git branch: 'main', credentialsId: 'github-ssh-jenkins', url: 'git@github.com:AnshengAriel/hello-world.git'
                echo '拉取成功'
            }
        }
        stage('构建项目') {
            steps {
                sh 'mvn clean package'
                echo '完成构建'
            }
        }
//         stage('清除镜像') {
//             steps {
//                 sshPublisher(publishers: [sshPublisherDesc(configName: 'wsl-server', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '''rm -rf helloworld
// docker stop helloworld
// docker rm helloworld
// docker rmi helloworld:1.0''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
//                 echo 'Success'
//             }
//         }
//         stage('打包镜像') {
//             steps {
//                 sshPublisher(publishers: [sshPublisherDesc(configName: 'wsl-server', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: 'helloworld', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: '**/*.jar'), sshTransfer(cleanRemote: false, excludes: '', execCommand: '''docker build -t helloworld:1.0 helloworld
// docker run -d -p 7079:7079 --name helloworld helloworld:1.0''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: 'helloworld', remoteDirectorySDF: false, removePrefix: 'docker', sourceFiles: '**/docker/Dockerfile')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
//                 echo 'Success'
//             }
//         }
    }
}
