pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/cybercules/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}