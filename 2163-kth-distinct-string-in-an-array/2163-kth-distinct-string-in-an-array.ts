function kthDistinct(arr: string[], k: number): string {
    let map:Map<string,number> = new Map() 
    for(let ch of arr){
         map.set(ch , (map.get(ch)|| 0 )+1)
    }

    let count = 0 
    for(let [key,val] of map){
         if(val==1)count++
         if(count==k)return key
    }
    return ""
};