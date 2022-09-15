module q3(a, b, c,d,g,f);
input a, b,c,d;
output g,f;
nand (e, a, b);
xor (f,e,c,d);
nor(g,d,c,b);

endmodule

