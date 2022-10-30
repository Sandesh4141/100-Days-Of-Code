# R program to create numeric vector
# Creation of vectors using c() function

v1 <- c(1,2,3,4)

#displays type of vector
typeof(v1) 

#By using L we can specify that we want integer values

v2 <- c(1L,3L,4L,5L,6L,55L)
print(v2[1])
print(v2[2])
print(v2[3])
print(v2[4])
typeof(v2)


# *********** Creating character vectors ***********
# By default numeric valus are converted into characters

v4 <- c("Mango", "Apple", "Banana", "Orange", 34)
typeof(v4)
print(v4)
print(v4[0]) #works but not as we expect
# as we know we can only start from zero
print(v4[1]) 
print(v4[2])
# we have 34 at last without quotes 
# but In R numeric values are converted into characters
typeof(v4[4])
# charcters holds one-byte integer in memory


# Logical Vectors in R
# Creating logical Vectors using c() function

v5 <- c(TRUE, FALSE,TRUE, TRUE , TRUE, FALSE, NA)
typeof(v5)
typeof(v5[2])
typeof(v5[7])

# Multiple ways to create R Vectors
# 1. c() function
# 2. ':' operator
# 3. seq() function

# Creating vector by second way
# ':' is used to create continous values 

# sequence(array) of 1 to 10 
v6 <- 1:10
cat("using semicolon:",v6, '\n')
typeof(v6)

v7 <- 1:100
cat("Sequence: ", v7, "\n")
typeof(v7)

print(v7[1:10])
print(v7[11:20])

add <- v7[1:10] + v7[11:20]
add2 <- v7[1:10] + v7[1:10]
print(add)






