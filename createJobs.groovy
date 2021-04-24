pipelineJob('spring-boot-api-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Lydialilulu/spring-boot-api.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}