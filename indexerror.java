int[] numbers = {1, 2, 3};
int value = numbers[3]; // ArrayIndexOutOfBoundsException: 유효하지 않은 인덱스에 접근

try {
                        sh "exit 1"
                        currentBuild.result = 'SUCCESS'
                        }catch (Exception err) {
                        currentBuild.result = 'FAILURE'
                        }
