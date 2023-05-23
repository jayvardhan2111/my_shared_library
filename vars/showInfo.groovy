def call(stage){
  echo "Stage : ${stage}"
sh 'date'
sh 'pwd'
sh 'whoami'
}
