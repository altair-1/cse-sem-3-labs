var array = readInt("enter array elements: ");
    s = 0,
    p = 1,
    i;
for (i = 0; i < array.length; i += 1) 
   {
    s += array[i];
    p *= array[i];
    }
println('sum: '+s + 'product: ' +p); 