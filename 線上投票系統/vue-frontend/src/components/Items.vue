<template>
    <div class = "container">
        <h1 class="text-center"> 投票項目 </h1>
        <table class="table table-striped">
            <thead>
                <th> 投票項目編號 </th>
                <th> 投票項目名稱 </th> 
            </thead>
            <tbody>
                <tr v-for="item in items" v-bind:key="item.id">
                    <td> {{item.id}} </td>
                    <td> {{item.itemName}} </td>
                </tr>
            </tbody>
        </table>
    </div>
</template>
<script>

import ItemService from '../services/ItemService';
export default{
    name: 'ITEMS',
    data() {
        return {
            items: []
        }
    },
    methods: {
        getItems(){
            ItemService.getItems().then((response) => {
                this.items = response.data;
            })

        }
    },
    created() {
        this.getItems();
    }
}
</script>

