echo "Please select any symbol to proceed rspt Operation :"
a=10
b=20
read st
case $st in 
        '+')
            echo "Sum : `expr $a + $b'";
            ;;
        '-')
            echo "Sum : `expr $a - $b'";
            ;;
        *)
            echo "Sum : `expr $a - $b'";
            ;;
esac