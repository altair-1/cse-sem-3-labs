// 4 to 16 decoder using 2 to 4 decoder
// 2 to 4 decoder using case statement

module q3(w,En,y);
    input [3:0] w;
    input En;
    output [0:15] y;
    wire [0:3] y2;
    
    twoToFourDecoder stage0(w[3:2],En,y2);
    twoToFourDecoder stage1(w[1:0],y2[0],y[0:3]);
    twoToFourDecoder stage2(w[1:0],y2[1],y[4:7]);
    twoToFourDecoder stage3(w[1:0],y2[2],y[8:11]);
    twoToFourDecoder stage4(w[1:0],y2[3],y[12:15]);

endmodule

module twoToFourDecoder(w,En,y);
    input [1:0] w;
    input En;
    output reg [0:3] y;
    always @ (w or En)
    begin
            y=4'b0000;
        if (En == 1)
        begin
            case(w)
            0:  y[0] = 1;
            1:  y[1] = 1;
            2:  y[2] = 1;
            3:  y[3] = 1; 
            endcase
        end
    end
endmodule

/*
module twoToFourDecoder(w,En,y);
    input [1:0] w;
    input En;
    output reg [0:3] y;
    integer k;
    always @(w or En)
    for (k = 0; k <= 3; k=k+1)
        if ((w==k) && (En == 1))
            y[k] = 1;
        else
            y[k] = 0;
endmodule */

