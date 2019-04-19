@Library('my-lib')_
import com.shlib.GlobalVariable
import com.shlib.addingTwoNumbers
import com.shlib.pipeline


node(){
stage('Demo') 
{  
echo 'Hello World !!!!!!!!!!!! Chaitanya'
passString 'Chaitanya'
println GlobalVariable.gbvar
}

stage('info and log'){
log.info 'Starting'
log.warning 'Nothing to do!'
}

stage('Calculate'){
    cal = new addingTwoNumbers();
    print cal.sum(2,5)
}

stage('pipeline'){
    p1 = new pipeline()
    p1.build()
    
}
}
