echo "This is my first Function Code in SHLL"
function ftn(){
    let a=$1
    let b=$2
    echo "Sum of $1 and $2 is :, `expr $a + $b`"
}
ftn 5 10
ftn 20 30