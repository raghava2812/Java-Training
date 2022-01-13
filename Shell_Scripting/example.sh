#To print Char by Char as a Triangle
# name="Muni Raghava"
# len=${#name}
# #a=`expr length $name`
# for((i=0;i<$len;i++))
# do
# for((j=0;j<=i;j++))
# do
# echo -n "${name:$i:1}"
# done
# echo ""
# done

#To print Name in a Triangle
read -p "Enter Name : " name1
# name1="Raghava"
len1=${#name1}
for((i=0;i<$len1;i++))
do
for((j=0;j<=i;j++))
do
echo -n "${name1:$j:1}"
done
echo ""
done
for((i=$len1;i>=0;i--))
do
for((j=0;j<i;j++))
do
echo -n "${name1:$j:1}"
done
echo ""
done