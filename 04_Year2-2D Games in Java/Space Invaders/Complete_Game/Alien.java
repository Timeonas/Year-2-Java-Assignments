����   ? :
      %Space_Invaders/Complete_Game/Sprite2D <init> #(Ljava/awt/Image;Ljava/awt/Image;)V	  	 
   "Space_Invaders/Complete_Game/Alien isAlive Z	     x D	     xSpeed	     winWidth I	     myImage Ljava/awt/Image;
      ! java/awt/Image getWidth !(Ljava/awt/image/ImageObserver;)I	  # $  y@4       Code LineNumberTable LocalVariableTable this $LSpace_Invaders/Complete_Game/Alien; i i2 move ()Z StackMapTable setFleetXSpeed (D)V dx reverseDirection ()V jumpDownwards <clinit> 
SourceFile 
Alien.java !      
               '   R     *+,� *� �    (       	    
 )         * +      ,      -    . /  '   n     .*Y� � c� *� �� *� � *� � d��� ��    (          *  ,  )       . * +   0    * 	 1 2  '   3     &� �    (   
       )        3    	 4 5  '   $      � w� �    (   
        6 5  '   ;     *Y� " %c� "�    (   
       )        * +    7 5  '         � �    (         8    9