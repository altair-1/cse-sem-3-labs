echo "enter n: "
read n

i=1
sum=0

echo "enter numbers: "
while [ $i -le $n ]
do
  read num          
  sum=$((sum + num)) 
  i=$((i + 1))
done

echo "sum of the numbers = $sum"
