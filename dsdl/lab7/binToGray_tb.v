`timescale 1ns/1ns
`include "binToGray.v"

module binToGray_tb();
reg [(3):0] g;
wire [(3):0] b;

binToGray gtb(g,b);
initial 
begin
    $dumpfile("binToGray_tb.vcd");
    $dumpvars(0,binToGray_tb);

    g = 4'b0011; #20; //0010
    g = 4'b0110; #20; //0100

    $display("test complete");    
end
endmodule
