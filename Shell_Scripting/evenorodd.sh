echo "To find Even or Odd"
echo "Enter Number: "
read num
if [ "`expr $num % 2`" == 0 ];
then
echo "$num is Even"
else
echo "$num is Odd"
fi